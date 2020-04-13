
export class ElementValueRelationship{

    public valueRelationshipId: number;

    constructor(
        public elementType: string,
        public elementValue: string,
        // Relationship manage to
        public elementType2: string,
        public elementValue2: string,
        public relatesTo: boolean,
        public elementType3 : string,
        public elementValue3: string,
    ){}

}