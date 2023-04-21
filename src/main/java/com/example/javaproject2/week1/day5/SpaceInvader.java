package com.example.javaproject2.week1.day5;

public class SpaceInvader {
    private int location;
    private void moveLeft() {
        location -= 1;
        System.out.printf("moveLeft: %d\n", location);
    }
    private void moveRight() {
        location += 1;
        System.out.printf("moveRight: %d\n", location);

    }
    public static void main(String[] args) {
        SpaceInvader simv = new SpaceInvader();
        simv.moveLeft();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        simv.moveRight();
        System.out.printf("최종위치: %d", simv.location);
    }
}
