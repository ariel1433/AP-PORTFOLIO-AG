export class Proyecto {
    id?: number;
    nombreE: string;
    descripcionE: string;
    imgE: string;
    urlE: string;

    constructor(nombreE: string, descripcionE: string, imgE: string, urlE: string){
        this.nombreE = nombreE;
        this.descripcionE = descripcionE;
        this.imgE = imgE;
        this.urlE = urlE;
    }
}
