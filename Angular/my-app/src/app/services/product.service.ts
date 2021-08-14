import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Product } from '../models/Product';

@Injectable({
  providedIn: 'root'
})
export class ProductService 
{

  constructor(private httpClient: HttpClient) // Inject HttpClient (import from @sangular/common/http)
  {

  }

  public getProducts(): Product[]
  {
    let products: Product[] = [];
    products.push(new Product(1, "Apple", 3, "https://ezsai.com/wp-content/uploads/2021/02/firefox_2018-07-10_07-50-11.png"));
    products.push(new Product(2, "Chocolate", 5, "https://health.clevelandclinic.org/wp-content/uploads/sites/3/2015/03/chocolateWhiteDark-454384771-770x533-1.jpg"));
    return products;
  }

  public getProductsAsync1(successCallback: Function)
  {
    try
    {
      setTimeout(() =>
      {
        let products: Product[] = [];
        products.push(new Product(1, "Apple", 3, "https://ezsai.com/wp-content/uploads/2021/02/firefox_2018-07-10_07-50-11.png"));
        products.push(new Product(2, "Chocolate", 5, "https://health.clevelandclinic.org/wp-content/uploads/sites/3/2015/03/chocolateWhiteDark-454384771-770x533-1.jpg"));
        successCallback(products);
      }, 5000)

    } catch (error)
    {

    }
  }

  public getProductAsync2(): Promise<Product[]> // Promises can only send a result once
  {
    return new Promise((resolve, reject) => // we can use whatever names we want
    {
      try
      {
        setTimeout(() =>
        {
          let products: Product[] = [];
          products.push(new Product(1, "Apple", 3, "https://ezsai.com/wp-content/uploads/2021/02/firefox_2018-07-10_07-50-11.png"));
          products.push(new Product(2, "Chocolate", 5, "https://health.clevelandclinic.org/wp-content/uploads/sites/3/2015/03/chocolateWhiteDark-454384771-770x533-1.jpg"));
          resolve(products);
        }, 5000)

      } catch (error)
      {
        reject(error);
      }
    });
  }

  public getProductAsync3() : Observable<Product[]>  // Observer can notify others multiple times
  {
    let obs = new Observable<Product[]>(observer =>
    {
      try
      {
        setTimeout(() =>
        {
          let products: Product[] = [];
          products.push(new Product(1, "Apple", 3, "https://ezsai.com/wp-content/uploads/2021/02/firefox_2018-07-10_07-50-11.png"));
          products.push(new Product(2, "Chocolate", 5, "https://health.clevelandclinic.org/wp-content/uploads/sites/3/2015/03/chocolateWhiteDark-454384771-770x533-1.jpg"));
          observer.next(products);
          setTimeout(() =>
          {
            products.push(new Product(1, "Apple", 3, "https://ezsai.com/wp-content/uploads/2021/02/firefox_2018-07-10_07-50-11.png"));
            products.push(new Product(2, "Chocolate", 5, "https://health.clevelandclinic.org/wp-content/uploads/sites/3/2015/03/chocolateWhiteDark-454384771-770x533-1.jpg"));
            observer.next(products);

          }, 1000)
        }, 5000)
      } catch (error)
      {
        observer.error(error);
      }
    });

    return obs;
  }

  public getProductAsync4() : Observable<Product[]>
  {
     return this.httpClient.get<Product[]>("http://localhost:8081/Products/getAll");
  }
}
