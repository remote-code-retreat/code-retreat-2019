<?php
declare(strict_types=1);

namespace Kata\Tests;

use Kata\GameOfLife;
use PHPUnit\Framework\TestCase;

class GameOfLifeTest extends TestCase
{
    public function testGameOfLifeIsDefined()
    {
        $gameOfLife = new GameOfLife();
        $this->assertNotEmpty($gameOfLife);
    }
}
