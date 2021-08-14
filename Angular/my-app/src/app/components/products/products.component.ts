import { Component, OnInit } from '@angular/core';
import { Product } from 'src/app/models/Product';
import { ProductService } from 'src/app/services/product.service';

@Component({
  selector: 'app-products',
  templateUrl: './products.component.html',
  styleUrls: ['./products.component.css']
})
export class ProductsComponent implements OnInit
{
  products: Product[] = [];
  loading = true;
  constructor(private productService: ProductService) 
  {
  }
  
  ngOnInit(): void // Injection 
  {
    // Callback
    // this.products = this.productService.getProducts();
    // this.productService.getProductsAsync1(this.setProducts);


    // this.productService.getProductsAsync1(data=>{
    //   this.loading = true;
    //   this.products = data;
    // })


/* Promise
    let promise : Promise<Product[]> = this.productService.getProductAsync2();
    promise.then((data)=> // Resolve
    {
      this.products = data;
      this.loading=false;
    })
    promise.catch((err) => // Reject
    {
      alert("error");
      this.loading=false;
    })
  */
 
    let obs = this.productService.getProductAsync3();
    obs.subscribe((products)=> // Function to invoke
    {
      this.products = products;
      this.loading = false;
    }, (error)=> // Optional Error function
    {
      this.loading = false;
      alert("error");
    });
    
  }

  public setProducts(products: Product[])
  { 
    this.products = products;
  }
}
