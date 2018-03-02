import { Injectable } from '@angular/core'
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";

@Injectable()
export class EventService{
    private baseUrl="http://localhost:8081/apiusers";
    constructor(private http: HttpClient)
    {
    }
    public getEvents():Observable<String[]>
    {
        debugger;
        return this.http.get<String[]>(this.baseUrl);
    }
}
