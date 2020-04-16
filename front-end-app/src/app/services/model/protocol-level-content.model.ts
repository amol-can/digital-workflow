
export class ProtocolLevelContentModel {
    public constructor(
        public protocolId: string,
        public acronym: string,
        public protocolTitle: string,
        public protocolShortTitle: string,
        public armName: string,
        public armType: string,
        public armDescription: string,
        public interventionModel: string,
        public interventionName: string,
        public interventionDescription: string,
        public interventionType: string,
        public masking: string,
        public numberOfArms: number
    ) { }
}