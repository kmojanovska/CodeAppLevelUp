import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';


import { AppComponent } from './app.component';
import {HeaderComponent} from "./header/header.component";
import {Main} from "./main/main";
import {EventItem} from "./event-item/event-item.component";
import {User} from "./user/user.component";


@NgModule({
  declarations: [
    AppComponent,
    HeaderComponent,
    Main,
    EventItem,
    User
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
