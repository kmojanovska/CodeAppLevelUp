import {Component, OnInit} from '@angular/core';
import {UserService} from "./services/userService";
import {User} from "./user/user.component";
import {CommentService} from "./services/commentService";

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent implements OnInit{
  title = 'app';
  usersData: Object[];
  commentsData: Object[];
  constructor(private users: UserService, private comments: CommentService){

  }
  ngOnInit(){
    this.users.getUsers().subscribe(user=>this.usersData=user);
    //debugger;
    this.comments.getComments().subscribe(comment=>this.commentsData=comment)
  }
}
