import { Component, OnInit } from '@angular/core';
import { CarService } from './services/carService/car.service';
import {
  AbstractControl,
  FormBuilder,
  FormGroup,
  Validators,
  FormControl,
} from '@angular/forms';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss'],
})
export class AppComponent implements OnInit {
  title = 'car_factory';
  result: string = '';
  myForm: FormGroup;
  name: String | any;
  constructor(private carService: CarService, fb: FormBuilder) {
    this.myForm = fb.group({
      name: [''],
    });
    this.name = this.myForm.controls['name'];
  }

  ngOnInit(): void {}

  public produceCar() {
    this.carService.produceCar(this.myForm.value.name).subscribe((data) => {
      this.result = data;
    });
  }
}
