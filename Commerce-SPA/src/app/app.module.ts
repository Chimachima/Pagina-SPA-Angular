import { ProductsListService } from './components/pages/store/products-list/services/products-list.service';
import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';
import { HttpClientModule } from '@angular/common/http';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HeaderComponent } from './components/header/header.component';
import { StoreComponent } from './components/pages/store/store.component';
import { FiltersComponent } from './components/pages/store/filters/filters.component';
import { ProductsListComponent } from './components/pages/store/products-list/products-list.component';
import { ProductsItemComponent } from './components/pages/store/products-list/products-item/products-item.component';
import { ReactiveFormsModule } from '@angular/forms';


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    StoreComponent,
    FiltersComponent,
    ProductsListComponent,
    ProductsItemComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    HttpClientModule,
    ReactiveFormsModule
  ],
  providers: [ProductsListService],
  bootstrap: [AppComponent]
})
export class AppModule { }
