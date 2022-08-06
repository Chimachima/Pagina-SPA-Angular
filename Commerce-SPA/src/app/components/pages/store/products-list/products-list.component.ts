import { ProductsModel } from './models/products-model';
import { ProductsListService } from './services/products-list.service';
import { Component, OnChanges, OnInit } from '@angular/core';


@Component({
  selector: 'app-products-list',
  templateUrl: './products-list.component.html',
  styleUrls: ['./products-list.component.css']
})
export class ProductsListComponent implements OnInit {

  movies!: Array<ProductsModel>;
 
  constructor(private productsListService: ProductsListService) { 
  }

  ngOnInit(): void {
    this.getMovies();
  }

  getMovies():void {
    this.productsListService.getProducts().subscribe(response=>{
      this.movies = response;
      console.log(response);
      console.log(this.movies);
    })
  }


}
