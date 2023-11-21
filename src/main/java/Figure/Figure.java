package Figure;

import interfaceFigure.IFigure;

abstract public class Figure implements IFigure {
private String figureName;

public Figure(String figureName){
    this.figureName = figureName;
}

    @Override
    public String getName(){
        return figureName;
    }

}
