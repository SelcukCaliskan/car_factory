import { HttpClient, HttpHeaders } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

let httpOptionsPlain = {
  headers: new HttpHeaders({
    Accept: 'text/plain',
    'Content-Type': 'text/plain',
  }),
  responseType: 'text',
};

@Injectable({
  providedIn: 'root',
})
export class CarService {
  constructor(private http: HttpClient) {}

  public produceCar(name: String) {
    return this.http.get(`http://localhost:8080/api/car-factory?name=${name}`, {
      responseType: 'text',
    });
  }
}
