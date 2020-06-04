package com.learn.demo;


import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Service
public class topicService {

    private List<topic> topics = new ArrayList<>(Arrays.asList(
            new topic("001","Introduction to C","History"),
            new topic("002","Fandamental of C","Fandamentals"),
            new topic("003","Output Statement","Fandamentals"),
            new topic("004","Input Statement","Fandamental")
            ));

    public List<topic> getTopics(){

        return topics;
    }

    public topic getTopic(String id){
        
        return topics.stream().filter(t -> t.getId().equals(id)).findFirst().get();
    }

    public void addTopic(topic topic) {

        topics.add(topic);
    }

    public void updateTopic(String id,topic topic) {
        for(int i=0;i<topics.size();i++){
            topic t = topics.get(i);
            if (t.getId().equals(id)){
                topics.set(i,topic);
                return;
            }
        }
    }

    public void deleteTopic(String id) {
        topics.removeIf(t -> t.getId().equals(id));

    }
}
