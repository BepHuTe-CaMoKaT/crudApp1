package main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.List;

public class SkillRepository {
    public Skill getById(Long id) {
        try {
            File file = new File("C:/Users/Никита/IdeaProjects/javaCore/src/main/resources/skills.txt");
            StringBuilder stringBuilder = new StringBuilder();
            try (FileInputStream in = new FileInputStream(file)) {
                try (BufferedReader br = new BufferedReader(new InputStreamReader(in))) {
                    String line;
                    while ((line = br.readLine()) != null) {
                        stringBuilder.append(line);
                    }
                    String fileContent = stringBuilder.toString();
                    String[] skillsAllRecords = fileContent.split("/");
                    for (String s:skillsAllRecords){
                        String[] skillsRecords = s.split(",");
                        if (Long.parseLong(skillsRecords[0])==id){
                            return new Skill(Long.parseLong(skillsRecords[0]),skillsRecords[1]);
                        }
                    }
                }
            }
            return null;
        }catch (Exception e) {
            throw new RuntimeException("Error is occurred in getById" + e.getMessage());
        }

    }

    public List<Skill> getAll() {
        return null;
    }

    public boolean save(Skill skill) {

        return false;
    }

    public Skill update(Skill skill) {
        return null;
    }

    public void deleteById(Long id) {

    }
}
