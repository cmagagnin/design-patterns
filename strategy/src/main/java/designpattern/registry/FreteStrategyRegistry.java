package designpattern.registry;

import designpattern.strategy.*;
import java.util.Collections;
import java.util.EnumMap;
import java.util.Locale;
import java.util.Map;

public class FreteStrategyRegistry {

    private final Map<FreteTipo, FreteStrategy> byEnum;

    public FreteStrategyRegistry() {
        EnumMap<FreteTipo, FreteStrategy> map = new EnumMap<>(FreteTipo.class);
        map.put(FreteTipo.PAC, new PACFrete());
        map.put(FreteTipo.SEDEX, new SedexFrete());
        map.put(FreteTipo.TRANSPORTADORA, new TransportadoraFrete());
        map.put(FreteTipo.ULTRASEDEX, new UltraSedexFrete());
        this.byEnum = Collections.unmodifiableMap(map);
    }

    public FreteStrategy get(FreteTipo tipo) {
        FreteStrategy s = byEnum.get(tipo);
        if (s == null) {
            throw new IllegalArgumentException("Tipo de frete não suportado: " + tipo);
        }
        return s;
    }

    public FreteStrategy get(String metodoEnvio) {
        if (metodoEnvio == null) {
            throw new IllegalArgumentException("Método de envio não pode ser nulo");
        }
        String norm = metodoEnvio.trim().toUpperCase(Locale.ROOT);

        if ("PAC".equals(norm)) {
            return get(FreteTipo.PAC);
        } else if ("SEDEX".equals(norm)) {
            return get(FreteTipo.SEDEX);
        } else if ("TRANSPORTADORA".equals(norm)) {
            return get(FreteTipo.TRANSPORTADORA);
        } else if ("ULTRASEDEX".equals(norm)) {
            return get(FreteTipo.ULTRASEDEX);
        } else {
            throw new IllegalArgumentException("Método de envio desconhecido: " + metodoEnvio);
        }
    }
}
