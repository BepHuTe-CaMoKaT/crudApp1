package main;

public class Main {

    public static void main(String[] args) {
        SkillRepository skillRepository = new SkillRepository();
        System.out.println(skillRepository.getById(2L));

    }
}
