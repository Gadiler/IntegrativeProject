/*
 * Copyrights (c) //Author Gadiler 11/03/2022, 17:49.
 * All rights reserved to Gadi Engelsman.
 * https://github.com/Gadiler/
 */

package integrativeProject.FinalProject.beans;

public enum Type {
    Admin(0),
    User(1),
    Guest(2);

    private final int type;

    Type(int i) {
        this.type = i;
    }

    public int getCategory() {
        return this.type;
    }
}
