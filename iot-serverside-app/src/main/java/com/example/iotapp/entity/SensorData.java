package com.example.iotapp.entity;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "SENSOR_DATA")
public class SensorData implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

    @Column(name = "CATEGORY")
    @Enumerated(EnumType.STRING)
    private SensorCategoryType categoryType;

    private String content;

    @Column(name = "SOURCE_UID")
    private String sourceUID;

    private Date createTimestamp;

    public SensorData() {
    }

    @PrePersist
    private void setValuesBeforePersist(){
        this.createTimestamp = new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

   public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getCreateTimestamp() {
        return createTimestamp;
    }

    public void setCreateTimestamp(Date createTimestamp) {
        this.createTimestamp = createTimestamp;
    }

    public SensorCategoryType getCategoryType() {
        return categoryType;
    }

    public void setCategoryType(SensorCategoryType categoryType) {
        this.categoryType = categoryType;
    }

    public String getSourceUID() {
        return sourceUID;
    }

    public void setSourceUID(String sourceUID) {
        this.sourceUID = sourceUID;
    }
}
