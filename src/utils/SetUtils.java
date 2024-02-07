package utils;

import entity.Task;
import java.util.Iterator;
import java.util.Set;
public class SetUtils {public static void printAllSet(Set<Task> set){
    for (Task task : set) {
        System.out.println("task detail: Project:" + task.getProject()
                + " Description: " + task.getDescription()
                + " Assignee: " + task.getAssignee() + " Priority: "
                + task.getPriority() + " Status: " + task.getStatus());
    }
}
}
