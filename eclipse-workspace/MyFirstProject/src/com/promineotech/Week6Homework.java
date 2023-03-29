package com.promineotech;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Card {
    private String name;
    private int value;

    public Card(String name, int value) {
        this.name = name;
        this.value = value;
    }

    public void describe() {
        System.out.println(name + " of value " + value);
    }

    public String getName() {
        return name;
    }

    public int getValue() {
        return value;
    }
}

class Deck {
    private List<Card> cards;

    public Deck() {
        cards = new ArrayList<Card>();
        String[] names = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
        int[] values = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13};

        for (String name : names) {
            for (int value : values) {
                Card card = new Card(name, value);
                cards.add(card);
            }
        }
    }

    public void shuffle() {
        Collections.shuffle(cards);
    }

    public Card draw() {
        return cards.remove(0);
    }
}

class Player {
    private List<Card> hand;
    private int score;
    private String name;

    public Player(String name) {
        hand = new ArrayList<Card>();
        score = 0;
        this.name = name;
    }

    public void describe() {
        System.out.println(name + "'s hand:");
        for (Card card : hand) {
            card.describe();
        }
    }

    public Card flip() {
        return hand.remove(0);
    }

    public void draw(Deck deck) {
        hand.add(deck.draw());
    }

    public void incrementScore() {
        score++;
    }

    public int getScore() {
        return score;
    }
}

class Week6Homework {
    public static void main(String[] args) {
        Deck deck = new Deck();
        deck.shuffle();

        Player player1 = new Player("Player 1");
        Player player2 = new Player("Player 2");

        for (int i = 0; i < 52; i++) {
            if (i % 2 == 0) {
                player1.draw(deck);
            } else {
                player2.draw(deck);
            }
        }

        for (int i = 0; i < 26; i++) {
            Card player1Card = player1.flip();
            Card player2Card = player2.flip();

            System.out.println("Player 1 plays " + player1Card.getName());
            System.out.println("Player 2 plays " + player2Card.getName());

            if (player1Card.getValue() > player2Card.getValue()) {
                player1.incrementScore();
                System.out.println("Player 1 wins the round!");
            } else if (player2Card.getValue() > player1Card.getValue()) {
                player2.incrementScore();
                System.out.println("Player 2 wins the round!");
            } else {
                System.out.println("It's a tie!");
            }

            System.out.println("Player 1's score: " + player1.getScore());
            System.out.println("Player 2's score: " + player2.getScore());
        }
    }
}
