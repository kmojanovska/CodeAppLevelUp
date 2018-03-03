import { Injectable } from '@angular/core'
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {Comment} from "../comment/comment.component";

@Injectable()
export class CommentService{
    private baseUrl="http://localhost:8081/api/comments";
    constructor(private http: HttpClient)
    {
    }
    public getComments():Observable<Object[]>
    {
        //debugger;
        return this.http.get<Object[]>(this.baseUrl);
    }
}
