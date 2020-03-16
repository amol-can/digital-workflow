export class ElementRelationship{
    public libraryRelationshipId: number;

    constructor(
        public elementType: string,
        public elementTypeId: string, // optional for foreign key
        public relatesTo: boolean,
        public elementType2: string,
        public elementType2Id: number, // optional for foreign key
        public mandatory: boolean,
    ){}

}