import { Component, OnInit } from '@angular/core';
import { CarCategory } from './../common/car-category';
import { CarService } from '../../services/car.service';

@Component({
  selector: 'app-car-category',
  templateUrl: './car-category.component.html',
  styleUrls: ['./car-category.component.css']
})
export class CarCategoryComponent implements OnInit {

  carCategories: CarCategory[];

  constructor(private _carService: CarService) { }

  ngOnInit() {
    this.listCarCategories();
  }

  listCarCategories(){
    this._carService.getCarCategories().subscribe(
      data => this.carCategories = data
    );
  }
