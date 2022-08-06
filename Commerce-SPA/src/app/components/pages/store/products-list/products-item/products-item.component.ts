import { ProductsModel } from './../models/products-model';
import { Component, Input, OnInit } from '@angular/core';

@Component({
  selector: 'app-products-item',
  templateUrl: './products-item.component.html',
  styleUrls: ['./products-item.component.css']
})
export class ProductsItemComponent implements OnInit {

  constructor() { }

  @Input() movie!: ProductsModel;

  ngOnInit(): void {
  }

}
