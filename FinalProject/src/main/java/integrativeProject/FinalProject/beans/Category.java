/*
 * Copyrights (c) //Author Gadiler 24/02/2022, 22:16.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.beans;

public enum Category {
    Food(0),
    Shopping(1),
    Vacation(2);

    private final int category;

    Category(int i){
        this.category = i;
    }
    public int getCategory(){
        return this.category;
    }
}
