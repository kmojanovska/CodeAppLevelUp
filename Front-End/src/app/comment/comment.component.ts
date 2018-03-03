import {Component} from "@angular/core";

@Component({
  selector: "comment",
  templateUrl: './comment.component.html'
})
export class Comment{
  id: number;
  comment: string;
  date: Date;
}
