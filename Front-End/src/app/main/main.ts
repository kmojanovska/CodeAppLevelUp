import {Component, OnInit} from "@angular/core";
import {EventItem} from "../event-item/event-item.component";
import {User} from "../user/user.component";
import {EventService} from "../services/eventService";
import {Observable} from "rxjs/Observable";

@Component({
  selector:'main-page',
  templateUrl:'./main.html',
  styleUrls: ['./main.css']
})
export class Main implements OnInit{
  events: Object[];
  users: Object[];
  constructor(private eventService:EventService )
  {
  }
  ngOnInit()
  {
    this.eventService.getEvents().subscribe(event => this.events = event);
  }
}
