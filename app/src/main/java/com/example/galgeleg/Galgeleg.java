package com.example.galgeleg;

public class Galgeleg {
    public void Begin(){
        this.state.begin();
    }
    public void Run(){
        this.state.run();
    }
    public void Loose(){
        this.state.loose();
    }
    public void Win(){
        this.state.win();
    }
}
