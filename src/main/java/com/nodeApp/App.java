package com.nodeApp;

import com.google.gson.Gson;
import com.nodeApp.model.Note;
import spark.Spark;

import java.util.concurrent.CopyOnWriteArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ){
        Spark.port(getPort());
        Spark.secure("servicekeystore.p12","serviceapp",null,null);
        CopyOnWriteArrayList<Note> notes = new CopyOnWriteArrayList<>();
        Spark.get("/note",(req,resp)->{
            resp.header("Content-Type","application/json");
            return new Gson().toJson(notes);
        });

        Spark.post("/note",(req,res)->{
            Note note = new Gson().fromJson(req.body(),Note.class);
            notes.add(note);
            return "";
        });
    }

    static int getPort() {
        if(System.getenv("PORT")!=null){
            return Integer.parseInt(System.getenv("PORT"));
        }
        return 8081;
    }
}
