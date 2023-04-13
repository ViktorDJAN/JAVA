//package org.example.OOP.seminar.seminar_3.task_2;
//
//public class JavaDevoleper implements Collection{
//    private String name;
//
//    public JavaDevoleper(String name, String[] skills) {
//        this.name = name;
//        this.skills = skills;
//    }
//
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public String[] getSkills() {
//        return skills;
//    }
//
//    public void setSkills(String[] skills) {
//        this.skills = skills;
//    }
//
//    private String[] skills;
//    @Override
//    public Iterator<T> getIterator() {
//        return new SkillIterator();
//    }
//    private class SkillIterator implements Iterator<T> {
//        int index;
//        @Override
//        public boolean hasNext() {
//            if (index<skills.length){
//                return true;
//            }
//            return false;
//        }
//
//        @Override
//        public Object next() {
//
//            return skills[index++];
//        }
//    }
//}
