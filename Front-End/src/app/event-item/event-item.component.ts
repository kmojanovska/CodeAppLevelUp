import {Component, Input} from "@angular/core";
import {User} from "../user/user.component";

@Component({
  selector:'event-item',
  templateUrl: './event-item.component.html'
})
export class EventItem{
  @Input() event: Object;
}
