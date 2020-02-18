import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';

import { AddCatalogueComponent } from './add-catalogue/add-catalogue.component';
import { ShowCatalogueComponent } from './show-catalogue/show-catalogue.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const routes: Routes = [
  {path:'',redirectTo:'/addcatalogue',pathMatch:'full'},  
  {path:'addcatalogue',component:AddCatalogueComponent},
  {path:'showcatalogue',component:ShowCatalogueComponent},
  {path:'**',component:PageNotFoundComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
export const routingComponents=[AddCatalogueComponent,ShowCatalogueComponent,PageNotFoundComponent]
