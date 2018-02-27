import {Component, OnInit} from "@angular/core";
import {EventItem} from "../event-item/event-item.component";

@Component({
  selector:'main-page',
  templateUrl:'./main.html'
})
export class Main implements OnInit{
  events: EventItem[];

  ngOnInit()
  {

  }
}
