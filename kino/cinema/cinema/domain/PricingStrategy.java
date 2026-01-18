package cinema.domain;

import java.time.DayOfWeek;
import java.time.LocalDateTime;

/**
 * Strategia obliczania ceny biletu w zależności od dnia tygodnia.
 */
public interface PricingStrategy {
    double calculatePrice(Auditorium auditorium, LocalDateTime showTime);

    /**
     * Implementacja domyślna — weekend ma 20% drożej.
     */
    static PricingStrategy weekendPricing() {
        return (auditorium, showTime) -> {
            DayOfWeek day = showTime.getDayOfWeek();
            double basePrice = auditorium.getBasePrice();
            
            if (day == DayOfWeek.SATURDAY || day == DayOfWeek.SUNDAY) {
                return basePrice * 1.2;
            }
            return basePrice;
        };
    }
}