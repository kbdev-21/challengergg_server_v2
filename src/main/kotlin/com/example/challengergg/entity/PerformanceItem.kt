package com.example.challengergg.entity

import com.example.challengergg.common.enums.ItemType
import jakarta.persistence.*
import java.util.UUID

@Entity
@Table(name = "performance_items")
class PerformanceItem {
    @Id
    @Column(name = "performance_item_id")
    var id: UUID = UUID.randomUUID();

    @ManyToOne
    @JoinColumn(name = "performance_id")
    var performance: Performance = Performance();

    var itemId: Int = 0;

    var slot: Int = 0;

    @Enumerated(EnumType.STRING)
    var type: ItemType = ItemType.OTHER;
}