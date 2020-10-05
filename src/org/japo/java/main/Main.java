/* 
 * Copyright 2020 Jose Ramon Albiach Vaño - joseramon.albiach.alum@gmail.com.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.japo.java.main;

import java.util.Locale;

/**
 *
 * @author Jose Ramon Albiach Vaño - joseramon.albiach.alum@gmail.com
 */
public class Main {
    public static void main(String[] args) {
        final double CAMBIO_EURO_DOLAR = 1.17;
        double euros = 5;
        System.out.printf(Locale.ENGLISH, 
                "El cambio de hoy es %.2f€ por %.2f$.%n", 
                euros, euros * CAMBIO_EURO_DOLAR );
        
    }
    
}
