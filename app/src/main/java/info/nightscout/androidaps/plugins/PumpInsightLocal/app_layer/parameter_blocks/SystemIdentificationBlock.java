package info.nightscout.androidaps.plugins.PumpInsightLocal.app_layer.parameter_blocks;

import info.nightscout.androidaps.plugins.PumpInsightLocal.descriptors.SystemIdentification;
import info.nightscout.androidaps.plugins.PumpInsightLocal.utils.ByteBuf;

public class SystemIdentificationBlock extends ParameterBlock {

    private SystemIdentification systemIdentification;

    @Override
    public void parse(ByteBuf byteBuf) {
        systemIdentification = new SystemIdentification();
        systemIdentification.setSerialNumber(byteBuf.readUTF16(18));
        systemIdentification.setSystemIdAppendix(byteBuf.readUInt32LE());
        systemIdentification.setManufacturingDate(byteBuf.readUTF16(22));
    }

    @Override
    public ByteBuf getData() {
        return null;
    }

    public SystemIdentification getSystemIdentification() {
        return systemIdentification;
    }
}
