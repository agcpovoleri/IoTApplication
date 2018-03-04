import { Component, OnInit } from '@angular/core';

import { User, SensorData } from '../_models/index';
import { UserService, SensorService, AuthenticationService } from '../_services/index';

@Component({
  moduleId: module.id,
  templateUrl: 'home.component.html'
})

export class HomeComponent implements OnInit {
  currentUser: User;
  users: User[] = [];
  sensorData: SensorData[] = [];

  constructor(private userService: UserService,
              private sensorService: SensorService,
              private authenticationService: AuthenticationService) {
    this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
  }

  ngOnInit() {
    this.loadAllUsers();
    this.loadAllSensorData();
  }

  deleteUser(id: number) {
    this.userService.delete(id).subscribe(() => {
      this.loadAllUsers();
      this.currentUser = JSON.parse(localStorage.getItem('currentUser'));
    });
  }

  logout() {
    this.authenticationService.logout();
  }

  private loadAllUsers() {
    this.userService.getAll().subscribe(users => { this.users = users; });
  }

  private loadAllSensorData() {
    this.sensorService.getAll().subscribe(sensorData => { this.sensorData = sensorData; });
  }
}
