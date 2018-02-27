import {Component} from "@angular/core";
import {User} from "../user/user.component";

@Component({
  selector:'event-item',
  template: './event-item.component.html'
})
export class EventItem{
  private id;
  private headline;
  private description;
  private location;
  private date;
  private organizer;
  participants: User[];
}
