package com.example.iotapp.rest;

import com.example.iotapp.config.filter.StatelessAuthenticationFilter;
import com.example.iotapp.dto.DtoConverter;
import com.example.iotapp.dto.SensorDataDetailResponse;
import com.example.iotapp.dto.SensorDataRequest;
import com.example.iotapp.entity.SensorData;
import com.example.iotapp.entity.User;
import com.example.iotapp.service.SensorDataService;
import com.example.iotapp.service.UserLoginService;
import com.google.common.base.Function;
import com.google.common.collect.Lists;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import javax.ws.rs.core.MediaType;
import java.util.List;

@RestController
@RequestMapping("/api/sensors")
public class SensorRest {

	private static final Logger logger = LoggerFactory.getLogger(SensorRest.class);

	@Autowired
	private SensorDataService sensorDataService;

    @Autowired
    private UserLoginService service;

    @ResponseStatus(value = HttpStatus.CREATED)
    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON)
    public void save(@Valid @RequestHeader(value = StatelessAuthenticationFilter.TOKEN_KEY, required = true) String authKeyToken,
                     @Valid @NotNull @RequestBody SensorDataRequest request){
        logger.info("Persisting SensorData: ");

        User user = null;
        try {
            this.service.getAuthenticatedUserFromToken(authKeyToken);
        } catch (Exception e) {
            //do nothing yet
        }

        SensorData sensorData = DtoConverter.buildSensorDataFromRequest(request);
        sensorDataService.create(sensorData);
    }

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON)
	public List<SensorDataDetailResponse> findAll() {
        return Lists.transform(sensorDataService.findAll(), new Function<SensorData, SensorDataDetailResponse>() {
            @Override
            public SensorDataDetailResponse apply(SensorData sensorData) {
                return DtoConverter.buildSensorDataDetail(sensorData);
            }
        });
	}
}
