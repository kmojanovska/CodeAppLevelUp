import { Injectable } from '@angular/core'
import {HttpClient} from "@angular/common/http";
import {Observable} from "rxjs/Observable";
import {User} from "../user/user.component";

@Injectable()
export class UserService{
    private baseUrl="http://localhost:8081/apiusers";
    constructor(private http: HttpClient)
    {
    }
    public getUsers():Observable<Object[]>
    {

        return this.http.get<Object[]>(this.baseUrl);
    }
}
