import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { TextAndButtonComponent } from './components/text-and-button/text-and-button.component';
import { HeaderComponent } from './components/header/header.component';
import { Layout1Component } from './components/layout1/layout1.component';
import { FooterComponent } from './components/footer/footer.component';
import { LogoComponent } from './components/logo/logo.component';
import { MenuComponent } from './components/menu/menu.component';
import { ContentComponent } from './components/content/content.component';
import { FormsModule } from '@angular/forms';
import { AboutComponent } from './components/about/about.component';
import { ContactUsComponent } from './components/contact-us/contact-us.component';
import { ProductsComponent } from './components/products/products.component';
import { ThumbnailComponent } from './components/thumbnail/thumbnail.component';
import { ProductComponent } from './components/product/product.component';
import { HttpClient } from '@angular/common/http'
@NgModule({
  declarations: [
    AppComponent,
    TextAndButtonComponent,
    HeaderComponent,
    Layout1Component,
    FooterComponent,
    LogoComponent,
    MenuComponent,
    ContentComponent,
    AboutComponent,
    ContactUsComponent,
    ProductsComponent,
    ThumbnailComponent,
    ProductComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule, FormsModule, HttpClient
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
