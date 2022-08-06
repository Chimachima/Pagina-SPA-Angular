import { Injectable } from '@angular/core'
import { HttpClient, HttpHeaders} from '@angular/common/http'
import { ProductsModel } from '../models/products-model'
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})

export class ProductsListService{
  private url = 'http://localhost:8080/';
  httpOptions = {
    headers: new HttpHeaders({'Content-Type':'application/json'})
  }
  constructor(private httpClient:HttpClient){}

  getProducts(): Observable<ProductsModel[]>{
    return this.httpClient.get<ProductsModel[]>(this.url)
  }

  postProducts(movie: ProductsModel): Observable<ProductsModel>{
    return this.httpClient.post<ProductsModel>(this.url, movie, this.httpOptions)
  }

  putProducts(id: number, movie:ProductsModel): Observable<ProductsModel>{
    return this.httpClient.put<ProductsModel>(`${this.url}/${id}`, movie, this.httpOptions)
  }

}




