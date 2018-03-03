import { Injectable } from '@angular/core'
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {User} from "../user/user.component";

@Injectable()
export class EventService{
    private baseUrl="http://localhost:8081/api/events";
    constructor(private http: HttpClient)
    {
    }
    public getEvents():Observable<Object[]>
    {
        //debugger;
        return this.http.get<Object[]>(this.baseUrl);
    }
}
