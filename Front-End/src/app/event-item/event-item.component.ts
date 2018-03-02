import {Component, Input} from "@angular/core";
import {User} from "../user/user.component";

@Component({
  selector:'event-item',
  templateUrl: './event-item.component.html'
})
export class EventItem{
  private id;
  private headline;
  private description;
  private location;
  private date;
  private organizer;
  participants: User[];
  @Input() users:User[];
}
