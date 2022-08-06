import { ProductsModel } from './../products-list/models/products-model';
import { ProductsListService } from './../products-list/services/products-list.service';
import { Component, OnInit } from '@angular/core';
import { FormBuilder, FormGroup } from '@angular/forms';
import { generate } from 'rxjs';
import { Router } from '@angular/router';

@Component({
  selector: 'app-filters',
  templateUrl: './filters.component.html',
  styleUrls: ['./filters.component.css']
})
export class FiltersComponent implements OnInit {

  movieForm: FormGroup;
  
  

  constructor(
    private fb: FormBuilder,
    private productsListService: ProductsListService,
    private router: Router,
  ) {
    this.movieForm = this.fb.group({
      ID: null,
      name: '',
      durationInMinutes: 0,
      genre: '',
      url: '',
    })
  }

  ngOnInit(): void {
  }

  
  createMovie(): void{
    this.productsListService.postProducts(this.movieForm.value).subscribe(result=>
      console.log("Cadastro realizado com sucesso"));
  }

  create(): void{
    this.createMovie();
    this.movieForm.reset();

}
  
}
