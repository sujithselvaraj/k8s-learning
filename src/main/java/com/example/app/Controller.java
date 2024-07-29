package com.example.app;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class Controller
{

//    public Controller() {
//        JobRunr.configure()
//                .useStorageProvider(new InMemoryStorageProvider())
//                .initialize();
//    }


    @GetMapping("/app")
    public String App()
    {
//        BackgroundJob.scheduleRecurrently(Cron.every15seconds(),() -> System.out.println("a recurring job"));
//        BackgroundJob.schedule(()-> System.out.println("qwerty1"), Instant.now().plusSeconds(5));

        return "Hi App";
    }




}
