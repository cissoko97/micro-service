import { Component } from '@angular/core';
import { HttpClient } from '@angular/common/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.scss']
})
export class AppComponent {

  title = 'micro-client';

  constructor(private httpClient: HttpClient) {

  }
  callServer() {
    this.httpClient.get("http://localhost:9001/Produits").subscribe(
      {
        next: (data) => {
          console.log(data);
        },
        error: (err) => {
          console.log(err);
        },
        complete: () => { },
      }
    )
  }

}
