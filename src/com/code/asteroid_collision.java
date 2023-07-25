package com.code;

import java.util.Stack;

public class asteroid_collision {
        static  Stack<Integer> result = new Stack<> ();

        public Object[] asteroidCollision(int[] asteroids) {
            result.push(asteroids[0]);
            for(int i=1;i< asteroids.length ; i++){
                pushElement (asteroids[i]);
            }
            int i=0;

            return result.toArray();
        }
        public static void  pushElement(int n){
            int temp = result.peek ();
            if(sameDirection (temp,n)) {
                if (result.peek () == n) {
                    result.pop ();
                } else {
                    result.push (n);
                }
            }
            else{

            }
        }
        public static boolean  sameDirection(int a , int b){
            if(a > 0 && b > 0 ){
                return true;
            }
            else if (a < 0 && b < 0 ){
                return true ;
            }
            return false
        }

    public static void main(String[] args) {
    }
    }