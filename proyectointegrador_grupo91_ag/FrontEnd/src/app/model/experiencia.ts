export class Experiencia {
    id? : number;
    nombreE : string;
    descripcionE : string;
    imgE: string;
    fechaE : string;

    constructor(nombreE: string, descripcionE: string, fechaE: string, imgE: string){
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.fechaE = fechaE;
        this.imgE = imgE;

    }
}
