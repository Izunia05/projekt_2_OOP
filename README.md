# Pomysł 2: Kino — rezerwacja i sprzedaż biletów

Cel: zarządzanie salami, seansami, miejscami i rezerwacjami biletów, z różnymi typami sal lub projekcji.

## Przykładowe użycie (fragmenty interfejsu)


## 1. Tworzenie sal (2 sale)

<pre class="not-prose w-full rounded font-mono text-sm font-extralight"><div class="codeWrapper text-light selection:text-super selection:bg-super/10 my-md relative flex flex-col rounded-lg font-mono text-sm font-normal bg-subtler"><div class="translate-y-xs -translate-x-xs bottom-xl mb-xl flex h-0 items-start justify-end sm:sticky sm:top-xs"><div class="overflow-hidden rounded-full border-subtlest ring-subtlest divide-subtlest bg-base"><div class="border-subtlest ring-subtlest divide-subtlest bg-subtler"><button data-testid="copy-code-button" aria-label="Skopiuj kod" type="button" class="focus-visible:bg-subtle hover:bg-subtle text-quiet  hover:text-foreground dark:hover:bg-subtle font-sans focus:outline-none outline-none outline-transparent transition duration-300 ease-out select-none items-center relative group/button font-semimedium justify-center text-center items-center rounded-full cursor-pointer active:scale-[0.97] active:duration-150 active:ease-outExpo origin-center whitespace-nowrap inline-flex text-sm h-8 aspect-square" data-state="closed"><div class="flex items-center min-w-0 gap-two justify-center"><div class="flex shrink-0 items-center justify-center size-4"><svg role="img" class="inline-flex fill-current shrink-0" width="16" height="16"><use xlink:href="#pplx-icon-copy"></use></svg></div></div></button></div></div></div><div class="-mt-xl"><div><div data-testid="code-language-indicator" class="text-quiet bg-subtle py-xs px-sm inline-block rounded-br rounded-tl-lg text-xs font-thin">text</div></div><div><span><code><span><span>=== 1. TWORZENIE SAL (2 sale) ===
</span></span><span>✅ Utworzono: Sala Kameralna (10x10)
</span><span>✅ Utworzono: Sala Kinowa Główna (15 rzędów, układ stadium)
</span><span></span></code></span></div></div></div></pre>

## 2. Tworzenie seansów (2 seanse)

<pre class="not-prose w-full rounded font-mono text-sm font-extralight"><div class="codeWrapper text-light selection:text-super selection:bg-super/10 my-md relative flex flex-col rounded-lg font-mono text-sm font-normal bg-subtler"><div class="translate-y-xs -translate-x-xs bottom-xl mb-xl flex h-0 items-start justify-end sm:sticky sm:top-xs"><div class="overflow-hidden rounded-full border-subtlest ring-subtlest divide-subtlest bg-base"><div class="border-subtlest ring-subtlest divide-subtlest bg-subtler"><button data-testid="copy-code-button" aria-label="Skopiuj kod" type="button" class="focus-visible:bg-subtle hover:bg-subtle text-quiet  hover:text-foreground dark:hover:bg-subtle font-sans focus:outline-none outline-none outline-transparent transition duration-300 ease-out select-none items-center relative group/button font-semimedium justify-center text-center items-center rounded-full cursor-pointer active:scale-[0.97] active:duration-150 active:ease-outExpo origin-center whitespace-nowrap inline-flex text-sm h-8 aspect-square" data-state="closed"><div class="flex items-center min-w-0 gap-two justify-center"><div class="flex shrink-0 items-center justify-center size-4"><svg role="img" class="inline-flex fill-current shrink-0" width="16" height="16"><use xlink:href="#pplx-icon-copy"></use></svg></div></div></button></div></div></div><div class="-mt-xl"><div><div data-testid="code-language-indicator" class="text-quiet bg-subtle py-xs px-sm inline-block rounded-br rounded-tl-lg text-xs font-thin">text</div></div><div><span><code><span><span>=== 2. TWORZENIE SEANSÓW (2 seanse) ===
</span></span><span>📽️ Seans 1: Matrix (2026-01-20 18:00) → Sala Kameralna
</span><span>📽️ Seans 2: Avatar 2 (2026-01-20 20:00) → Sala Kinowa Główna
</span><span></span></code></span></div></div></div></pre>

## 3. Robienie rezerwacji

<pre class="not-prose w-full rounded font-mono text-sm font-extralight"><div class="codeWrapper text-light selection:text-super selection:bg-super/10 my-md relative flex flex-col rounded-lg font-mono text-sm font-normal bg-subtler"><div class="translate-y-xs -translate-x-xs bottom-xl mb-xl flex h-0 items-start justify-end sm:sticky sm:top-xs"><div class="overflow-hidden rounded-full border-subtlest ring-subtlest divide-subtlest bg-base"><div class="border-subtlest ring-subtlest divide-subtlest bg-subtler"><button data-testid="copy-code-button" aria-label="Skopiuj kod" type="button" class="focus-visible:bg-subtle hover:bg-subtle text-quiet  hover:text-foreground dark:hover:bg-subtle font-sans focus:outline-none outline-none outline-transparent transition duration-300 ease-out select-none items-center relative group/button font-semimedium justify-center text-center items-center rounded-full cursor-pointer active:scale-[0.97] active:duration-150 active:ease-outExpo origin-center whitespace-nowrap inline-flex text-sm h-8 aspect-square" data-state="closed"><div class="flex items-center min-w-0 gap-two justify-center"><div class="flex shrink-0 items-center justify-center size-4"><svg role="img" class="inline-flex fill-current shrink-0" width="16" height="16"><use xlink:href="#pplx-icon-copy"></use></svg></div></div></button></div></div></div><div class="-mt-xl"><div><div data-testid="code-language-indicator" class="text-quiet bg-subtle py-xs px-sm inline-block rounded-br rounded-tl-lg text-xs font-thin">text</div></div><div><span><code><span><span>=== 3. ROBIENIE REZERWACJI ===
</span></span><span>
</span><span>>> Rezerwacja na Matrixa (ID: RES-001):
</span><span>✅ SUKCES: Zarezerwowano miejsce: Rząd 1, M1
</span><span>✅ SUKCES: Zarezerwowano miejsce: Rząd 1, M2  
</span><span>✅ SUKCES: Zarezerwowano miejsce: Rząd 2, M3
</span><span>
</span><span>>> Rezerwacja na Avatara (ID: RES-002):
</span><span>✅ SUKCES: Zarezerwowano miejsce: Rząd 3, M5
</span><span>✅ SUKCES: Zarezerwowano miejsce: Rząd 3, M6
</span><span>✅ SUKCES: Zarezerwowano miejsce: Rząd 5, M10
</span><span></span></code></span></div></div></div></pre>

## 4. Mapa sali – Matrix (Sala Kameralna)

<pre class="not-prose w-full rounded font-mono text-sm font-extralight"><div class="codeWrapper text-light selection:text-super selection:bg-super/10 my-md relative flex flex-col rounded-lg font-mono text-sm font-normal bg-subtler"><div class="translate-y-xs -translate-x-xs bottom-xl mb-xl flex h-0 items-start justify-end sm:sticky sm:top-xs"><div class="overflow-hidden rounded-full border-subtlest ring-subtlest divide-subtlest bg-base"><div class="border-subtlest ring-subtlest divide-subtlest bg-subtler"><button data-testid="copy-code-button" aria-label="Skopiuj kod" type="button" class="focus-visible:bg-subtle hover:bg-subtle text-quiet  hover:text-foreground dark:hover:bg-subtle font-sans focus:outline-none outline-none outline-transparent transition duration-300 ease-out select-none items-center relative group/button font-semimedium justify-center text-center items-center rounded-full cursor-pointer active:scale-[0.97] active:duration-150 active:ease-outExpo origin-center whitespace-nowrap inline-flex text-sm h-8 aspect-square" data-state="closed"><div class="flex items-center min-w-0 gap-two justify-center"><div class="flex shrink-0 items-center justify-center size-4"><svg role="img" class="inline-flex fill-current shrink-0" width="16" height="16"><use xlink:href="#pplx-icon-copy"></use></svg></div></div></button></div></div></div><div class="-mt-xl"><div><div data-testid="code-language-indicator" class="text-quiet bg-subtle py-xs px-sm inline-block rounded-br rounded-tl-lg text-xs font-thin">text</div></div><div><span><code><span><span>Mapa sali na film: Matrix (2026-01-20 18:00)
</span></span><span>[X] [X] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [X] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>--------------------------------
</span><span></span></code></span></div></div></div></pre>

## 5. Mapa sali – Avatar 2 (Sala IMAX)

<pre class="not-prose w-full rounded font-mono text-sm font-extralight"><div class="codeWrapper text-light selection:text-super selection:bg-super/10 my-md relative flex flex-col rounded-lg font-mono text-sm font-normal bg-subtler"><div class="translate-y-xs -translate-x-xs bottom-xl mb-xl flex h-0 items-start justify-end sm:sticky sm:top-xs"><div class="overflow-hidden rounded-full border-subtlest ring-subtlest divide-subtlest bg-base"><div class="border-subtlest ring-subtlest divide-subtlest bg-subtler"><button data-testid="copy-code-button" aria-label="Skopiuj kod" type="button" class="focus-visible:bg-subtle hover:bg-subtle text-quiet  hover:text-foreground dark:hover:bg-subtle font-sans focus:outline-none outline-none outline-transparent transition duration-300 ease-out select-none items-center relative group/button font-semimedium justify-center text-center items-center rounded-full cursor-pointer active:scale-[0.97] active:duration-150 active:ease-outExpo origin-center whitespace-nowrap inline-flex text-sm h-8 aspect-square" data-state="closed"><div class="flex items-center min-w-0 gap-two justify-center"><div class="flex shrink-0 items-center justify-center size-4"><svg role="img" class="inline-flex fill-current shrink-0" width="16" height="16"><use xlink:href="#pplx-icon-copy"></use></svg></div></div></button></div></div></div><div class="-mt-xl"><div><div data-testid="code-language-indicator" class="text-quiet bg-subtle py-xs px-sm inline-block rounded-br rounded-tl-lg text-xs font-thin">text</div></div><div><span><code><span><span>Mapa sali na film: Avatar 2 (2026-01-20 20:00)
</span></span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [X] [X] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [X]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>[_] [_] [_] [_] [_] [_] [_] [_] [_] [_]
</span><span>----------------------------
</span><span></span></code></span></div></div></div></pre>

## 6. Eksport raportów CSV

<pre class="not-prose w-full rounded font-mono text-sm font-extralight"><div class="codeWrapper text-light selection:text-super selection:bg-super/10 my-md relative flex flex-col rounded-lg font-mono text-sm font-normal bg-subtler"><div class="translate-y-xs -translate-x-xs bottom-xl mb-xl flex h-0 items-start justify-end sm:sticky sm:top-xs"><div class="overflow-hidden rounded-full border-subtlest ring-subtlest divide-subtlest bg-base"><div class="border-subtlest ring-subtlest divide-subtlest bg-subtler"><button data-testid="copy-code-button" aria-label="Skopiuj kod" type="button" class="focus-visible:bg-subtle hover:bg-subtle text-quiet  hover:text-foreground dark:hover:bg-subtle font-sans focus:outline-none outline-none outline-transparent transition duration-300 ease-out select-none items-center relative group/button font-semimedium justify-center text-center items-center rounded-full cursor-pointer active:scale-[0.97] active:duration-150 active:ease-outExpo origin-center whitespace-nowrap inline-flex text-sm h-8 aspect-square" data-state="closed"><div class="flex items-center min-w-0 gap-two justify-center"><div class="flex shrink-0 items-center justify-center size-4"><svg role="img" class="inline-flex fill-current shrink-0" width="16" height="16"><use xlink:href="#pplx-icon-copy"></use></svg></div></div></button></div></div></div><div class="-mt-xl"><div><div data-testid="code-language-indicator" class="text-quiet bg-subtle py-xs px-sm inline-block rounded-br rounded-tl-lg text-xs font-thin">text</div></div><div><span><code><span><span>=== 4. EKSPORT RAPORTÓW CSV ===
</span></span><span>✅ SUKCES: Wygenerowano raport CSV: raport_matrix.csv
</span><span>✅ SUKCES: Wygenerowano raport CSV: raport_avatar.csv
</span><span>
</span><span>=== KONIEC ===
</span><span>📁 Sprawdź pliki .csv w folderze resources/cinema-reports/ !
</span><span></span></code></span></div></div></div></pre>

**Przykładowy plik CSV (`raport_matrix.csv`):**

![1768846529105](image/README/1768846529105.png)
