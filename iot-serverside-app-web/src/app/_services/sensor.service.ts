import { Injectable } from '@angular/core';
import { HttpClient } from '@angular/common/http';

import { SensorData } from '../_models/index';

@Injectable()
export class SensorService {
    constructor(private http: HttpClient) { }

    getAll() {
        return this.http.get<SensorData[]>('/api/sensors');
    }

}
