import { Component, OnInit } from '@angular/core';
import { JavaServiceService, Catalogue } from '../java-service.service';

@Component({
  selector: 'app-show-catalogue',
  templateUrl: './show-catalogue.component.html',
  styleUrls: ['./show-catalogue.component.css']
})
export class ShowCatalogueComponent implements OnInit {
  catalogueObj:Catalogue[];
  public images:any=[];
  constructor(private javaServiceObj:JavaServiceService) { 
    
      
  }

  ngOnInit() {
    this.javaServiceObj.javaGetCatalogue().subscribe(
      (response) =>{this.catalogueObj = response;
        //console.log(this.catalogueObj[response.length-1]);
        //console.log(response.length);
      }
     );

    this.javaServiceObj.getImage().subscribe(
      response=>{
        this.images=response;
       // console.log(this.images);   
      }
    );
  }

}
