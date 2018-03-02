import {Component, OnInit} from "@angular/core";
import {EventItem} from "../event-item/event-item.component";
import {User} from "../user/user.component";
import {EventService} from "../services/eventService";
import {Observable} from "rxjs/Observable";

@Component({
  selector:'main-page',
  templateUrl:'./main.html'
})
export class Main implements OnInit{
  events: Observable<String[]>;
  users: User[];
  constructor(private eventService:EventService )
  {
  }
  ngOnInit()
  {
    this.events=this.eventService.getEvents();
  }
}
